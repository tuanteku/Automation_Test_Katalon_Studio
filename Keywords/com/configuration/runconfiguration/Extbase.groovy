package com.configuration.runconfiguration

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration

public class Extbase {
	@Keyword
	public static runBatchFile(String batchFile) {
		Runtime rt = Runtime.getRuntime();

		String bf = RunConfiguration.getProjectDir() + '/' + batchFile;
		println("Full path of batch file: " + bf);

		Process pr = rt.exec(bf);
	}
}
