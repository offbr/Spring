package pack.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pack.model.BuserDto;
import pack.model.DaoInter;
import pack.model.GogekDto;

@Controller
public class GogekController {
	@Autowired
	private DaoInter inter;
	
	@RequestMapping(value="gogekSearch", method=RequestMethod.GET)
	public String gogek(){
		return "gogek";
	}
	
	@RequestMapping(value="gogekSearch", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> gogekSearch(@RequestParam("gogek_no") String gogek_no, @RequestParam("gogek_name") String gogek_name){
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
		Map<String, String> data = null;
		
		Map<String, String> map = new HashMap();
		map.put("gogek_no", gogek_no);
		map.put("gogek_name", gogek_name);
		List<GogekDto> gogekList = inter.gogekSearch(map);
		
		if(gogekList.size() == 0){
			data = new HashMap<String, String>();
			data.put("sawon_name", "데이터가 없습니다");
			data.put("sawon_jik", "");
			data.put("buser_name",  "");
			data.put("buser_tel",  "");
			dataList.add(data);
		}else{
			for(GogekDto g : gogekList){
				data = new HashMap<String, String>();
				data.put("sawon_name", g.getSawon_name());
				data.put("sawon_jik", g.getSawon_jik());
				data.put("buser_name",  g.getBuser_name());
				data.put("buser_tel",  g.getBuser_Tel());
				dataList.add(data);
			}
		}
		
		Map<String, Object> gogekLists = new HashMap<String, Object>();
		gogekLists.put("datas", dataList);
		
		return gogekLists;
	}
	
	@RequestMapping(value="buserSearch", method=RequestMethod.GET)
	public String buser(){
		return "buser";
	}
	
	@RequestMapping(value="buserSearch", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> buserSearch(@RequestParam("buser_name") String buser_name){
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
		Map<String, String> data = null;
		
		Map<String, String> map = new HashMap();
		map.put("buser_name", buser_name);
		List<BuserDto> buserList = inter.buserSearch(map);
		
		for(BuserDto b: buserList){
			data = new HashMap<String, String>();
			data.put("buser_name",  b.getBuser_name());
			data.put("sawon_no",  b.getSawon_no());
			data.put("sawon_name", b.getSawon_name());
			data.put("buser_tel",  b.getBuser_tel());
			data.put("sawon_jik", b.getSawon_jik());
			data.put("count",  b.getCount());
			dataList.add(data);
		}
		
		Map<String, Object> buserLists = new HashMap<String, Object>();
		buserLists.put("datas", dataList);
		
		return buserLists;
	}
	
	@RequestMapping("gogekList")
	@ResponseBody
	public Map<String, Object> gogekList(@RequestParam("sawon_no") String sawon_no){
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
		Map<String, String> data = null;
		
		Map<String, String> map = new HashMap();
		map.put("sawon_no", sawon_no);
		
		List<BuserDto> gogekList = inter.gogekList(map);
		
		for(BuserDto b: gogekList){
			data = new HashMap<String, String>();
			data.put("gogek_no",  b.getGogek_no());
			data.put("gogek_name", b.getGogek_name());
			data.put("gogek_tel",  b.getGogek_tel());
			data.put("gogek_jumin", b.getGogek_jumin());
			dataList.add(data);
		}
		
		Map<String, Object> gogekLists = new HashMap<String, Object>();
		gogekLists.put("datas", dataList);
		
		return gogekLists;
	}
}

















