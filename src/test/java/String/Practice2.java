package String;

public class Practice2 {
	String name;
	int rollnum;
	public Practice2(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rollnum=this.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 p=new Practice2("Manishf");
		System.out.println(p);
		Practice2 po=new Practice2("priya");
		System.out.println(po);

	}
	@Override
	public String toString() {
		return "name==>"+name+" "+rollnum;
		
	}
	
}
