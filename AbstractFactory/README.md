场景：从pizza店获取不同款式的pizza。

1. pizza具有不同的种类
2. 每类pizza依赖一系列不同的原料（比如，NYStylePizza需要来自纽约的面团、沙拉酱、肉...)
3. pizza店是连锁店，只会根据不同原pizza进行加工，然后卖给顾客，当然他们根据实际情况收不一样的钱。

设计思路：

pizza店无需关注原料，甚至它并不需要知道pizza的具体实现，只需要有pizza的抽象概念。

同时，为了避免麻烦，生产同一系列Pizza的工作也不应该由Pizza店承担，商店只需要把pizza烤好，出售即可。

因此，可以委托对应的工厂（或者一个工厂的不同生产线）去用不同系列的原材料生产不同口味的pizza。

这里，由于实际原材料随时可变，食品工厂只依赖于抽象的原料概念。