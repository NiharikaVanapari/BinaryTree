package binarytree;

public class BinaryNode<T extends Comparable<T>> 
{
	
	T key;
	BinaryNode<T> left;
	BinaryNode<T> right;
	
	public BinaryNode(T key)
	{
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public BinaryNode() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return "BinaryNode [data=" + key + ", left=" + left + ", right=" + right + "]";
	}
}