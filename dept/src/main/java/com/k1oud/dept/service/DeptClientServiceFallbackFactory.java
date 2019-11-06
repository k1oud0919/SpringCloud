package com.k1oud.dept.service;

import com.k1oud.dept.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	//不要用lombok，会侵入业务代码，很多时候编译器无法解析代码，更加难定位。
	@Autowired
	Dept dept;

	//针对每一个接口里的所有方法，都有各自对应的工厂 implements FallbackFactory<对应接口名>
	//每一个方法的熔断机制都卸载重写的create()里面
	@Override
	public DeptClientService create(Throwable throwable)
	{
		return new DeptClientService() {
			@Override
			public Dept get(long id)
			{
				dept.setDeptno(id);
				dept.setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
				dept.setDb_source("no this database in MySQL");
				return dept;
			}

			@Override
			public List<Dept> list()
			{
				//这里面写针对list（）方法异常代码
				return null;
			}

			@Override
			public boolean add(Dept dept)
			{
				//add（）方法异常代码
				return false;
			}
		};
	}
}
