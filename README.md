
DesignPatterns
1. This git repo contains java design pattern examples like coffee machine, vending machine, thread pool executor examples
2. designpatterns module =>
    2.1 Behavioral design pattern: Observer, Strategy
    2.2 Creational design pattern: Abstract Factory, Builder, Factory, Singleton
    2.3 Structural design pattern: Adapter, Proxy

Proxy Design Pattern:
A bank's heque or credit card is a proxy for what is in our bank account. It can be used in place of cash,
and provides a means of accessing that cash when required. And that’s exactly what the Proxy pattern does
– “Controls and manage access to the object they are protecting“.

Adapter Design Pattern:
As a real life example, we can think of a mobile charger as an adapter because mobile battery needs 3 volts
to charge but the normal socket produces either 120V (US) or 240V (India).
So the mobile charger works as an adapter between mobile charging socket and the wall socket.
Adapter design pattern is used so that two unrelated interfaces can work together.
The object that joins these unrelated interfaces is called an Adapter.
In the adapter pattern, a wrapper class (i.e., the adapter) is used translate requests from
it to another class (i.e., the adoptee). In effect, an adapter provides particular interactions
with an adoptee that are not offered directly by the adoptee.

#Specification.COMMENT