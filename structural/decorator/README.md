# 装饰器模式（Decorator）

装饰器模式（Decorator Pattern）是一种结构型设计模式，用于在不改变现有对象结构的情况下，动态地向对象添加额外的责任和行为。装饰器模式允许您通过将对象包装在装饰器类中，以透明和灵活的方式在运行时扩展对象的功能。

1. **组件（Component）：** 定义被装饰对象的接口，可以是具体的类或抽象类。
2. **具体组件（Concrete Component）：** 实现了组件接口，是被装饰的对象，可以被装饰器装饰。
3. **装饰器（Decorator）：** 维持一个指向组件对象的引用，实现与组件接口相同的接口，以便透明地为组件对象添加功能。
4. **具体装饰器（Concrete Decorator）：** 实现了装饰器接口，具体装饰器可以为组件对象添加具体的附加功能。

## 具体实现

- `OrderService` 接口定义了订单服务的基本操作，包括 `createOrder` 和 `completeOrder`。
- `OrderServiceDecorator` 接口继承自 `OrderService`，是装饰器的基本接口，表示可以用于装饰的对象。
- `AppOrderServiceDecorator` 类是具体的装饰器，它持有一个 `OrderService` 实例，并在其基础上扩展功能。在 `createOrder` 和 `completeOrder` 方法中，它调用了基础服务的方法，并添加了额外的 "Decorator" 字符串。
- `AppOrderService` 类是订单服务的具体实现，实现了 `OrderService` 接口的方法。

通过使用装饰器模式，您可以在不改变原有的 `AppOrderService` 代码的情况下，为订单服务添加新的装饰功能。这种方式非常适合在不同场景下，动态地为对象添加不同的功能，从而使代码更加灵活和可扩展。