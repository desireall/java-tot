package pers.yuhuo.tot.mvc.fileupload;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fileupload")
public class FileUploadControler {

	public static final String IPA_STRING = "ipa";

	public static final String APK_STRING = "apk";

	@Value("${ipa.save_path}")
	public String ipa_save_path;

	@Value("${ipa.bak_path}")
	public String ipa_bak_path;

	@Value("${apk.save_path}")
	public String apk_save_path;

	@Value("${apk.bak_path}")
	public String apk_bak_path;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView gmmail(ModelAndView mv, HttpServletRequest req) {
		// mv.setViewName("error_fileupload");
		mv.setViewName("download");
		// mv.addObject("message", "File uploaded successfully");
		return mv;
	}

	@RequestMapping("list")
	public ModelAndView result(ModelAndView mv, HttpServletRequest req) {
		// mv.setViewName("error_fileupload");
		mv.setViewName("download");
		// mv.addObject(attributeName, attributeValue)
		mv.addObject("message", "File uploaded successfully");
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processUpload(@RequestParam MultipartFile file, Model model)
			throws IOException {
		model.addAttribute("message", "File '" + file.getOriginalFilename()
				+ "' uploaded successfully");
		// 保存相对路径到数据库 图片写入服务器
		if (file != null && !file.isEmpty()) {
			// 获取图片的文件名
			String fileName = file.getOriginalFilename();
			// 获取图片的扩展名
			String extensionName = fileName
					.substring(fileName.lastIndexOf(".") + 1);

			if (extensionName != null
					&& (extensionName.equalsIgnoreCase(IPA_STRING) || extensionName
							.equalsIgnoreCase(APK_STRING))) {

				if (extensionName.equalsIgnoreCase(IPA_STRING)) {
					// 解析保存 .ipa
					FileUploadService.saveipa(file, ipa_save_path);
				} else if (extensionName.equalsIgnoreCase(APK_STRING)) {
					// 解析保存 .apk
					FileUploadService.saveapk(file, apk_save_path);
				} else {
					System.err.println("error ！");
				}
			}
		}
		// 重定向
		return "redirect:/fileupload/list";
	}

}
