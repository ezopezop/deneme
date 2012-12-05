

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def with: Int = if(contents.length == 0) 0 else contents(0).length  
}