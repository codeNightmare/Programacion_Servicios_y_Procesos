package ejerciciosProse.ejerUd1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ud1Ejer10 {

	public static void main(String[] args) {

		List<String> lCmdLinux = new ArrayList<String>();
		lCmdLinux.add("/bin/bash");
		lCmdLinux.add("-c");
		lCmdLinux.add("echo $MI_NOMBRE");
		
		List<String> lCmdWin = new ArrayList<String>();
		lCmdWin.add("CMD");
		lCmdWin.add("/C");
		lCmdWin.add("echo");
		lCmdWin.add("%MI_NOMBRE%");
		
		List<String> lCommand = null;
		
		// Se adapta al SO
		if (System.getProperty("os.name").contains("Windows")) {
			lCommand = lCmdWin;
		} else {
			lCommand = lCmdLinux;
		}
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		Map<String, String> vEnt = pb.environment();
		vEnt.put("MI_NOMBRE", "JAVI");	
		pb.inheritIO();	// Le asigna al proceso creado una E/S estandar que ya tenia el ProcessBuilder.
		System.out.println("Variables de entornos: " + vEnt);
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
