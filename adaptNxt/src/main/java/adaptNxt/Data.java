package adaptNxt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Data {
	public static void main(String[] args) throws IOException {
		List<String[]> csv=create();
		
		try (CSVWriter writer=new CSVWriter(new FileWriter("Pro_Det"))){
			writer.writeAll(csv);
		}
		try (CSVWriter writer=new CSVWriter(new FileWriter("Pro_Det.csv"))){
			writer.writeAll(csv);
		}

	}

	public static List<String[]> create(){
		String [] header={"Product Name","Product Price","Item Number","Model Number","Product Category","Product Description"};
		
		String [] row1 ={"Emerge Vizon 47 Gaming Desk","139.99","24442485","59260","Office Desks","With rigorous performance testing and next-level features that can be customized to complement your personal playing style, Emerge helps you up your game. Built in monitor platform, cable management, add on storage pieces, and integrated lighting help you personalize your desk and maximize performance. Made to last and impress, this desk is designed and vetted to meet our highest standards - and your"};
		
		String [] row2 ={"Staples Kendall Park L-Desk","279.99","24290427","52493","Office Desks","This Kendall Park L-Shaped desk features a spacious workspace with optimal storage for your home or small office. It has Laminated Cherry finish,One letter file sized drawers, Two additional drawers for additional storage"};
		
		String [] row3 ={"Easy 2 Go Student Desk","54.99","24343774","WE-OF-0146G","Student Desks","Easy 2 Go Student Desk with Bookcases with Laminate, gray finish and 30inx40inx19in"};
		
		String [] row4 ={"Union & Scale MidMod 60in Computer and Writing Storage Desk","199.99","24398973","UN59685-CC","Office Desks","The simple design and classic mid-century modern details make this desk perfect for modern decor themes or casual open office settings, and the rectangular desktop provides space for a laptop and peripherals."};
		
		String [] row5 ={"Abington 60in Computer Desk","229.99","2736557","SPUS-ABTD","Office Desks","A flip-down drawer tray puts your keyboard at a comfortable height for typing, while two open storage compartments provide space for office supplies and other frequently used items."};
		
		String [] row6 ={"Staples GillespieL-Shaped Desk","119.99","1929202","ST28189-CC","Office Desks","Boasting a compact design and modern style, this desk takes up minimal floor space and adds a contemporary touch to existing decor with its sleek Sonoma cherry finish and black metal frame."};
		
		String [] row7 ={"Easy 2 Go Corner Computer Desk","94.99","24343773","WE-OF-0152G","Office Desks","Easy 2 Go Corner Computer Desks with laminate Grey Finish and with size 30.39x47.83x47.83"};
		
		String [] row8 ={"Easy2Go Student 40","67.99","2093917","WE-OF-0146-CC","Student Desks","The compact footprint fits neatly in a corner or spare room, while the simple design coordinates effortlessly with a wide range of decor themes. This desk boasts a built-in three-shelf bookcase, providing handy storage for binders, notebooks and other essentials."};
		
		String [] row9 ={"Whalen Emergent Gaming 60","219.99","24308799","SPUS-EGDB","Gaming Desks","Assemble a complete set of gaming gear on this black computer desk. The spacious tabletop offers plenty of room for multiple monitors, and the ventilated storage cabinets, accessory trays and cable management ports provide neat organization for a CPU and peripherals."};
		
		String [] row10={"Easy 2 Go 48 Corner Desk","89.99","952543","952543-CC","Office Desks"," Dual work spaces promote more efficient multitasking, and the durable resort cherry laminate finish brings long-lasting modern appeal to the workplace. With its clean lines and traditional design, this Easy 2 Go corner desk integrates easily into most home or office spaces."};
		
		List<String[]> list =new ArrayList<String[]> ();
		list.add(header);
		list.add(row1);
		list.add(row2);
		list.add(row3);
		list.add(row4);
		list.add(row5);
		list.add(row6);
		list.add(row7);
		list.add(row8);
		list.add(row9);
		list.add(row10);
		
		return list;
	}
}
