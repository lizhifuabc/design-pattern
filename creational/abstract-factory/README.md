# 抽象工厂模式

抽象工厂模式（Abstract Factory Pattern）是一种创建型设计模式，它提供了一种接口，用于创建一系列相关或相互依赖的对象，而无需指定其具体类。抽象工厂模式是工厂方法模式的进一步扩展，它将多个工厂方法组合在一起，形成一个工厂的集合，用于创建不同类型的相关对象。

1. **抽象工厂（Abstract Factory）**：定义了一组用于创建产品的方法，每个方法对应一个具体的产品族。
2. **具体工厂（Concrete Factory）**：实现了抽象工厂接口，用于创建具体的产品。
3. **抽象产品（Abstract Product）**：定义了产品的结构和方法，可以是一个接口或抽象类。
4. **具体产品（Concrete Product）**：实现了抽象产品定义的具体类。

## 具体实现

1. `OrderFactory` 是抽象工厂接口，扩展了 `BeanFactory`。它定义了创建订单和完成订单的方法。
2. `CreateOrder` 和 `CompleteOrder` 是抽象产品接口，分别定义了创建订单和完成订单的方法。
3. `H5OrderFactory` 是具体工厂类，实现了 `OrderFactory` 接口。它负责创建 H5 版本的订单相关产品。
4. `H5CreateOrder` 和 `H5CompleteOrder` 是具体产品类，实现了 `CreateOrder` 和 `CompleteOrder` 接口。它们是 H5 版本的订单创建和完成实现。
