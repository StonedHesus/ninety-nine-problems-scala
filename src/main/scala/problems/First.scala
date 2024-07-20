package problems

object First: 
  def last[A](l: Seq[A]): A =
    l match 
      case h :: Nil => h
      case h :: t => last(t)
      case Nil => throw new RuntimeException("The provided sequence is empty")

  def last2[A](l: Seq[A]): A = l.lastOption.getOrElse(throw new RuntimeException("The provided sequence is empty"))

