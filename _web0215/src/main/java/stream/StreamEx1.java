package stream;

import java.util.Arrays;
import java.util.List;

public abstract class StreamEx1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream()//스트림 생성
//		.filter(i->i%2==0)//중간단계
		.map(i->"요소는"+i+"입니다.")
		.limit(3)
//		.forEach(i->System.out.println(i));//최종단계
		.forEach(System.out::println);//static 메소드만 가능
		
//		=new ArrayList<>();
//		list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); //위와 같은 말
//		for(Integer i : list) {
//			if(i % 2 == 0) {//2의 배수 추출
//				System.out.println(i);
//			}
//		}

	}

}
