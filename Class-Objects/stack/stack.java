
class stack{
	int e[]=new int[10];
	int tos=-1;
	void push(int a){
		if(!isFull())
		{
			tos++;
		    e[tos]=a;
		}
		else{
			System.out.println("Full");
		}
	}
	void pop(){
		if(!isEmpty()){
			tos--;
			System.out.println("Popped");
		}
		else
			System.out.println("Empty");
	}
	boolean isEmpty(){
	if (tos==-1)
	 return true;
	 else
	  return false;
	}
	boolean isFull(){
	if(tos==9)
	return true;
	else
	return  false;
	}
	boolean spaceLeft(){
	if(tos<9)
	return true;
	else
	return false;
	}
    void display(){
    	for(int i=tos;i>=0;i++)
    	System.out.println(e[i]+" ");
    }
}