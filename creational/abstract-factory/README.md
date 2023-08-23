# 抽象工厂模式

1. `OrderFactory` 是抽象工厂接口，扩展了 `BeanFactory`。它定义了创建订单和完成订单的方法。
2. `CreateOrder` 和 `CompleteOrder` 是抽象产品接口，分别定义了创建订单和完成订单的方法。
3. `H5OrderFactory` 是具体工厂类，实现了 `OrderFactory` 接口。它负责创建 H5 版本的订单相关产品。
4. `H5CreateOrder` 和 `H5CompleteOrder` 是具体产品类，实现了 `CreateOrder` 和 `CompleteOrder` 接口。它们是 H5 版本的订单创建和完成实现。
