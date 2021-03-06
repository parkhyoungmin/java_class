
public class A05_print {

	public static void main(String[] args) {
		 
		// # 嬬車拭 窒径馬奄 是廃 食君亜走 敗呪級
		
		// 1. print()
		// - 匝聖 切疑生稽 郊荷走 省生悟 窒径馬澗 敗呪
		System.out.print("Hello, World!");
		System.out.print("Hello, World!");
		System.out.print("Hello, World!\n");
		
		// 2. println()
		// - 匝聖 切疑生稽 郊荷悟 窒径馬澗 敗呪
		// - ()拭 穿含廃 汽戚斗 固 及拭 '\n'聖 蓄亜馬食 窒径廃陥  
		// - ()拭 焼巷依亀 穿含馬走 省生檎 '\n'幻 窒径廃陥
		System.out.println("Print, World!");
		System.out.println("");
		System.out.println("Hello, World!"); 
		
		// 3. printf()
		// - 辞縦 庚切研 戚遂背 窒径拝 呪 赤澗 敗呪
		// - 辞縦聖 戚遂馬澗惟 畷軒廃 井酔亜 弦陥
		// - 匝聖 切疑生稽 郊蚊爽走 省澗陥
		
		// 2020鰍 10杉 20析 窒径
		int year = 2020;
		int month = 10;
		int day = 20;
		System.out.printf("%d鰍 %d杉 %d析\n", year, month, day);
		
		// # printf拭 紫遂馬澗 辞縦 庚切級
		/*
		 %d		: 10遭呪 舛呪 (decimal)
		 %x, X	: 16遭呪 舛呪 (hexa decimal)
		 %o		: 8遭呪 舛呪 (octal)
		 %s		: 庚切伸 (String)
		 %c		: 庚切 (Character)
		 %f		: 叔呪
		 */
		System.out.printf("%x%x%x\n", 10, 11, 12);
		System.out.printf("%s\n", "1去厭");
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65, 'A', 65, 65);
		
		// # 辞縦庚切 辛芝
		// 『 d幻 隔嬢醤 馬澗 依精 焼還
		
		// %収切d : 収切幻鏑 牒聖 溌左廃 及 神献楕 舛慶馬食 窒径廃陥
		System.out.printf("戚硯: %10s\n", "畠掩疑");
		System.out.printf("蟹戚: %10d\n", 15);
		
		// 格巷 掩檎 角庁陥
		System.out.printf("戚硯: %10s\n", "けけけけけけけけけけけけけけ");
		
		// %-収切d : 収切幻鏑 牒聖 溌左廃 及 図楕 舛慶馬食 窒径廃陥
		System.out.printf("%-10s : HonGilDon\n", "Full name");
		System.out.printf("%-10s : 15\n", "Age");
		
		// %0収切d : 収切幻鏑 牒聖 溌左廃 及 朔牒拭 0聖 辰趨 窒径廃陥
		System.out.printf("%010d\n", 123);
		System.out.printf("%020f\n", 123.123);
		
		// % + 収切d : 丞呪 蒋拭亀 採硲研 細戚惟 吉陥
		System.out.printf("神潅精 七松 '%+d”'脊艦陥.\n", -5);
		System.out.printf("神潅精 七松 '%+d”'脊艦陥.\n", 20);
		
		// %.収切f : 社呪 切鹸呪研 竺舛廃陥
		System.out.printf(".3\t: %.3f\n", 123.123);
		System.out.printf("default\t: %f\n", 123.123);
		System.out.printf(".10\t: %.10f\n", 123.123);
		System.out.printf(".20\t: %.20f\n", 123.123);
		System.out.printf(".255\t: %.255f\n", 123.123);
		
	}

}



















