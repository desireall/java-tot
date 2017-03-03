package pers.yuhuo.tot.mvc.fileupload;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadService {
	
	/**
	 * TODO  配置参数 
	 *   文件保存路径
	 *   备份文件保存路径
	 * @param file
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public static void saveipa(MultipartFile file , String savePath) throws IllegalStateException, IOException {
        File parentFile = new File(savePath);
        if(parentFile.isDirectory() && !parentFile.exists()){
        	parentFile.mkdirs();
        }
//        String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"  
//                + file.getOriginalFilename();  
        //TODO
        // ipa 文件解析
        // 根据ipa的包名 保存到指定的目录
        
        // 文件保存路径  
        String filePath = savePath +File.separator+file.getOriginalFilename();
        
        System.err.println("保存的文件路径: "+filePath);
        //TODO 
        // 转存文件
        File upload = new File(filePath);
        System.err.println(upload.getParent());
        try {
        	file.transferTo(upload);    //直接保存,源文件存在 直接覆盖
		} catch (Exception e) {
			e.fillInStackTrace();
		}
//        upload.delete();
        
	}
	
	
	
	
	
	public static void saveapk(MultipartFile file , String savePath) {

        File parentFile = new File(savePath);
        if(parentFile.isDirectory() && !parentFile.exists()){
        	parentFile.mkdirs();
        }
//        String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"  
//                + file.getOriginalFilename();  
        // TODO
        // apk 文件解析
        // 根据ipa的包名 保存到指定的目录
        
        
        // 文件保存路径  
        String filePath = savePath +File.pathSeparator+file.getOriginalFilename();
        System.err.println("保存的文件路径: "+filePath);
        //TODO 
        // 转存文件  
        try {
        	file.transferTo(new File(filePath));    //直接保存,源文件存在 直接覆盖
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
	
	
	
}
