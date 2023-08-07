package t_725p306_9;

//Hotel 은 객실예약과 예약 현황을 나타내는 클래스 

class Hotel { // 외부클래스 
         
	class Room{ // 내부클래스 
		
		
		int num;
	String name;
	
	public Room (int num, String name) {
		this.name = name;
		this.num = num;
		
				
		
	} // 생성자 
	} // 룸
	
	// 배열선언 시작 
	Room[] rooms = new Room [9];
	
	
	void add (int num, String name) {
		if (num > 0 && num <= 9) {
			rooms [num] = new Room(num,name);
		} //if 끝
		
	}// add 끝 
	
	    void show() { 
	    
	    	
	        for (Room  room : rooms) {
	      	        	if (room != null)
	        		System.out.println(room.num + "번 방을 " + room.name + "예약했습니다." );
	        }// 포 끝
	    }//쇼 끝
} // 클래스호텔 끝


public class HotelTest {
	
	public static void main(String[] args) {

		Hotel hotel = new Hotel () ;
		hotel.add(5,"호돌이");
		hotel.add(7,"길동이");
		hotel.show();
		
		
		
	}


}