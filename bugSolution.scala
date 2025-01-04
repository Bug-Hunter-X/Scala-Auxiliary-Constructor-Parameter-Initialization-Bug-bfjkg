```scala
class MyClass(val value: Int) {
  def this(otherValue:Int) = this(otherValue) // Correct way to make sure primary constructor params get set
  def this() = this(0) // Auxiliary constructor correctly initializing the primary constructor parameter 
}

val instance1 = new MyClass(5)
val instance2 = new MyClass()
val instance3 = new MyClass(10)
println(instance1.value) // Output: 5
println(instance2.value) // Output: 0
println(instance3.value) //Output: 10
```