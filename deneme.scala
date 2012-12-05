

abstract class Element {
  def contents: Array[String]
  val height: Int = contents.length
  val with: Int = if(contents.length == 0) 0 else contents(0).length  
}

Class ArrayElement(val contents: Array[Sting]) extends Element {
	
}