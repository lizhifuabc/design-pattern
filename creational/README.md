# 创建型模式

- **[factory](./factory) 简单工厂模式（Factory）**：用于根据客户端的输入或条件来创建对象，而无需将对象的创建逻辑暴露给客户端。
- **[abstract-factory](./abstract-factory) 抽象工厂模式（Abstract Factory）**：提供一个接口，用于创建一系列相关或相互依赖的对象，而无需指定其具体类。
- **[singleton](./singleton) 单例模式（Singleton）**：确保一个类只有一个实例，并提供一个全局访问点。
- **[builder](./builder) 建造者模式（Builder）**：将一个复杂对象的构建过程与其表示分离，使得同样的构建过程可以创建不同的表示。
- **[factory-method](./factory-method) 工厂方法模式（Factory Method Pattern）**：定义了一个创建产品的接口，由具体的工厂类来实现这个接口，从而创建不同类型的产品。每个具体工厂类负责创建一种产品。
- **[step-builder](./step-builder) Step Builder** 模式是一种创建对象的设计模式，它旨在提供一种易于使用、清晰明了的方式来构建复杂的对象。