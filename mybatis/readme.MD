###mybatis中用到了哪些设计模式？

1.Builder模式 SqlSessionFactoryBuilder XmlConfigBuilder XMLStatementBuilder

2.工厂模式 SqlSessionFactory MapperProxyFactory ObjectFactory

3.责任链模式 InterceptorChain

4.装饰器模式 CachingExecutor对其它Executor的装饰 LoggingCache, LruCache等对PerpetualCache的装饰

5.模板模式 BaseExecutor与子类SimpleExecutor, BatchExecutor, ReuseExecutor

6.动态代理模式 MapperProxy ProxyFactory Plugin