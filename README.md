# Basic RMI example with Java
Here **Add**, **Subtract**, **Multiply** and **Divide** operations has a their own corresponding Remote Interfaces and implementations.

Compile the files using this command:
```
javac *.java
```
compile stub and skeleton using this command:
```
rmic AddClass SubtractClass MultiplyClass DivideClass
```
You will see the stub.class in the same directory.
Start rmiregistry on **windows**:
```
start rmiregistry
```

on **Unix**:
```
rmiregistry &
```


Run the server:

```
java RMIServer
```


On another terminal run the client:
```
java RMIClient
```
Stop rmiregistry on **unix**:
```
killall -9 rmiregistry
```
