
package com.cadpur.cadpurnlineseba.Utils;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Zelar tortho Item Category
		addVideoItem("ORxX7AS4-Zg", " সরাসরি সময় টিভি ", "SOMOY TV LIVE | সময় টিভি লাইভ | সরাসরি সময় টিভি");
		addVideoItem("L6M4r7LinE4", "সরাসরি চ্যানেল 24 টিভি ", "Channel 24 Live | সরাসরি চ্যানেল 24 লাইভ");
		addVideoItem("bXE9TXI6yss", "সরাসরি ডিবিসি নিউজ টেলিভিশন", "DBC NEWS LIVE | সরাসরি ডিবিসি নিউজ টেলিভিশন");
		addVideoItem("osRNwiJw4Tk", "সরাসরি এনটিভি ", "NTV Live | সরাসরি এনটিভি");
		addVideoItem("DlVSfZcx_f0", "সরাসরি যমুনা টিভি", "Jamuna TV | সরাসরি যমুনা টিভি");
		addVideoItem("X-vscCpkqKY", " সরাসরি এটিএন নিউজ", "ATN News Live TV | সরাসরি এটিএন নিউজ");
		addVideoItem("vSHelsYpvkc", "সরাসরি  জি টিভি অফিসিয়াল টিভি ", "GTV Official Live | সরাসরি জি টিভি অফিসিয়াল টিভি");
		addVideoItem("bXE9TXI6yss", "সরাসরি ডিবিসি নিউজ টেলিভিশন", "DBC NEWS LIVE | সরাসরি ডিবিসি নিউজ টেলিভিশন");
		addVideoItem("pH6M3Khub8Q", "সরাসরি আর টিভি লাইভ", "Rtv Live | সরাসরি আর টিভি লাইভ");
		addVideoItem("0X4mixcK7aE", "সরাসরি সংবাদ টিভি", "News24 Live | সরাসরি সংবাদ টিভি");
		createPlayListForVideo("জেলার তথ্য", R.drawable.category_1);


		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */



		//===========================
		//==========================================================================*






	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

