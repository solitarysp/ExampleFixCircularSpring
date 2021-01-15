
- Circular DI xẩy ra khi cho 1 class A Phụ thuộc vào class B, Class B cũng phụ thuộc vào class A. Việc có tổn tại a và B là require khi tạo object.
```
┌─────┐
|  classA defined in file [ExampleFixCircularSpring\target\classes\com\lethanh98\example\service\errorExample\ClassA.class]
↑     ↓
|  classB defined in file [ExampleFixCircularSpring\target\classes\com\lethanh98\example\service\errorExample\ClassB.class]
└─────┘
```

- Có 1 số cách fix như truyển sang field, setter, lazy