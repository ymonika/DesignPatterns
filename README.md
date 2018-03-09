
DesignPatterns
1. This git repo contains java design pattern examples like coffee machine, vending machine, thread pool executor examples
2. designpatterns module =>
    2.1 Behavioral design pattern: Observer, Strategy
    2.2 Creational design pattern: Abstract Factory, Builder, Factory, Singleton
    2.3 Structural design pattern: Adapter, Proxy, Facade, Composite

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

Facade Design Pattern:
It is used to identifying a simple way to realize relationships between entities
the Facade can be used to hide the inner workings of a third party library, or some legacy code.
All that the client needs to do is interact with the Facade, and not the subsystem that it is encompassing
For example, in web services, one web service might provide access to a number of smaller services
that have been hidden from the caller by the facade

Composte Design Pattern:
Composite pattern is used where we need to treat a group of objects in similar way as a single object.
Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.

#Specification.COMMENT