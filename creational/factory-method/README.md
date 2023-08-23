# 工厂方法模式

工厂方法模式（Factory Method Pattern）：定义了一个创建产品的接口，由具体的工厂类来实现这个接口，从而创建不同类型的产品。每个具体工厂类负责创建一种产品。

## 具体实现

- `OrderService` 是抽象产品接口，定义了订单服务的行为，包括获取订单类型和创建订单。
- `OrderServiceFactory` 是抽象工厂接口，定义了创建订单服务的方法。
- `H5OrderServiceFactory` 是具体工厂类，实现了抽象工厂接口。在它的构造方法中，使用了 `EnumMap` 来保存不同订单类型对应的订单服务实例。通过 `create` 方法，它返回一个固定的 `H5OrderService` 实例。
- `H5OrderService` 是具体产品类，实现了抽象产品接口。它定义了订单的类型和创建方法的实现
