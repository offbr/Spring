package business;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.SawonDto;
import model.SawonInter;

@Service
public class BusinessImpl implements BusinessInter{
	
	@Autowired
	private SawonInter sawonInter;
	
	@Override
	public void sawonList() {
		int cou = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 입력: ");
		String buser = sc.nextLine();
		for(SawonDto s:sawonInter.selectAll()){
			if(s.getBuser_num().equals(buser)){
				System.out.println(s.getSawon_no() + " " + 
						s.getSawon_name() + " " + 
						s.getBuser_name() + " " +
						s.getSawon_jik());				
				cou++;				
			}
			
		}
		System.out.println("인원수 : " + cou + "명");
	}

}
