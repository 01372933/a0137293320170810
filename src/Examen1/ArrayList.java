package Examen1;


public class ArrayList<E> implements List<E> {
	public Object[] top;
	private int size;
	private int initialCapacity = 5;
	private int extraCapacity = 5;
	
	/**
	 * Creates a new ArrayList instance with the default initial capacity.
	 */
	public ArrayList() {
		top = new Object[initialCapacity];
		size = 0;
	}
	
	/**
	 * Increases the capacity of this ArrayList instance so that it 
	 * can hold at least extraCapacity elements more.
	 * This method allocates a new array with greater capacity than the
	 * current one (top.length + extraCapacity) and copies all elements
	 * from top to the newly allocated array. The reference top is then
	 * updated to point to the new array. 
	 * @param extraCapacity increase the capacity of this ArrayList by this amount
	 */
	private void reserveExtraCapacity(int extraCapacity) {
            
            if (this.size==top.length){
                Object[] NTop= new Object[top.length+ extraCapacity];
                
                for (int i=0; i<=top.length;i++){
                    NTop[i]=this.top[i];
                   
                }
               top=NTop; 
            }
            
            
            
            
	}
	
	/**
	 * Increases the capacity of this list if its size equals the length of the array
	 * where the data is stored. This method calls reserveExtraCapacity when (size() >= top.length).
	 * reserveExtraCapacity is called using the instance variable extraCapacity.
	 */
	private void ensureCapacity() {
            if(this.size()>=top.length){
                reserveExtraCapacity(extraCapacity);
            }
            
            
	}
	
	/**
	 * Shifts elements in the array (top) to the right, starting at the given position.
	 * @param index the position in which the shift will begin
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
	 */
	private void shiftContentsRight(int index) {
           ensureCapacity();
           int nuevoindice=0; 
           if (index<0||index>size)
                throw new IndexOutOfBoundsException();
            for(int i=0; i<index;i++){
                nuevoindice++;
                if(i==index-1){
                    for (int j=nuevoindice; j<=size;j++){
                    top[size-1]=this.top[size];
                } //me pRECE QUE CON ESTO YA HE DEJADO EL INDICE QUE ME PIDEN LIBRE
            }
            
	}}
	
	@Override
	public void addFirst(E e) {
            ensureCapacity();
            for (int i=0; i!=size; i++){
                top[size-1]=top[size];
                size--;
            }
            top[0]=e;
		size++;
	}

	@Override
	public void addLast(E e) {
            ensureCapacity();
            
            top[size]=e;
                    size++;
	}

	@Override
	public void add(int index, E element) {
                ensureCapacity();
		
		// me hizo falta modificar este y los otros
		
		SNode<E> current = top;
		for(int i = 0; i < index; i++)
			current = current.next;
		
		newNode.next = current.next;
		current.next = newNode;
		size++;
	}

	@Override
	public E getFirst() {
		return null;
	}

	
	@Override
	public E getLast() {
		return null;
	}

	
	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public void clear() {
            top = null;
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
            if(top.next == null)
			return "[]";
		
		SNode<E> current = top.next;
		String returnValue = "[" + current.value;
		while(current.next != null) {
			current = current.next;
			returnValue += ", " + current.value;
		}
		
		returnValue += "]";
		return returnValue;
	}
	}

