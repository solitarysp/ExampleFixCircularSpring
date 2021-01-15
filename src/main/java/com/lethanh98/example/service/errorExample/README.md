- A phụ thuộc vào B, B cũng phụ thuộc vào A.
- Vì chúng ta đang sử dụng Constructor để inject nên nó sẽ chờ vô tận, bởi vì nếu A chưa tạo thì chưa thể tạo B. B chưa tạo thì cũng chưa thể tạo A

```
┌─────┐
|  classA defined in file [ExampleFixCircularSpring\target\classes\com\lethanh98\example\service\errorExample\ClassA.class]
↑     ↓
|  classB defined in file [ExampleFixCircularSpring\target\classes\com\lethanh98\example\service\errorExample\ClassB.class]
└─────┘
```

