package rpn;

public class Pilha {
  public Node primeiro;
  public int length;

  public Pilha() {
    this.primeiro = null;
    this.length = 0;
  }

  public boolean isEmpty() {
    return (this.primeiro == null);
  }

  public boolean push(String item) {
    try {
      Node newNode = new Node(item);
      newNode.next = this.primeiro;
      this.primeiro = newNode;
      length++;
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public boolean pop() {
    if (isEmpty()) {
      return false;
    }
    // Node temp;
    // temp = this.topo;
    this.primeiro = primeiro.next;
    length--;
    return true;
  }

  @Override
  public String toString() {
    String str = "[ ";
    Node temp = primeiro;
    while (temp != null) {
      str += temp.value + " ";
      temp = temp.next;
    }
    str += "]";
    return str;
  }
}
