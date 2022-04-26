package util;

public class List {
	
	private Node head;
	
	public void add (Double valor) {
		Node node = new Node();
		node.setValor(valor);
		node.setProximo(head);
		head = node;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[ ");
		Node p = head;
		while (p != null ) {
			sb.append(p.getValor() + " ");
			p = p.getProximo();
		}
		
		sb.append("]");
		return sb.toString();
	}
	

}
