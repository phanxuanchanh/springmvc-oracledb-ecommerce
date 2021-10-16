package Ecommerce.SystemController;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemEntity.Datafile;
import Ecommerce.SystemService.DatafileServiceImpl;

@Controller
public class DatafileController {
	@Autowired
	private DatafileServiceImpl datafileServiceImpl;
	
	@RequestMapping(value = "he-thong/dba_data_files", method = RequestMethod.GET)
	public ModelAndView DatafileList(HttpSession httpSession) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/datafile-list");
		modelAndView.addObject("datafiles", datafileServiceImpl.GetDatafiles());
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/danh-sach-datafile-theo-tablespace", method = RequestMethod.GET)
	public ModelAndView DatafileByTablespaceList(HttpSession httpSession, @RequestParam(value = "tablespace_name", required = false) String tablespaceName) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/datafile-list-by-tablespace");
		if(tablespaceName == null)
			modelAndView.addObject("datafiles_byTablespace", new ArrayList<Datafile>());
		else
			modelAndView.addObject("datafiles_byTablespace", datafileServiceImpl.GetDatafiles_ByTablespace(tablespaceName));
		
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/chi-tiet-datafile/{fileId}", method = RequestMethod.GET)
	public ModelAndView DatafileDetail(HttpSession httpSession, @PathVariable BigDecimal fileId) {
		if (fileId.intValue() <= 0)
			return new ModelAndView("redirect:/he-thong/dba_data_files");

		Datafile datafile = datafileServiceImpl.GetDatafile(fileId);
		if (datafile == null)
			return new ModelAndView("redirect:/he-thong/dba_data_files");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/datafile-detail");
		modelAndView.addObject("datafile", datafile);
		return modelAndView;
	}
}
