/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 */

package autosaveworld.config;

import java.io.*;
import java.util.*;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;


public class AutoSaveConfig {
		
	private FileConfiguration config;
	public AutoSaveConfig() {}
	
	
	// Variables
	//debug
	public boolean varDebug = false;
	//save
	public int saveInterval = 900;
	public boolean saveBroadcast = true;
	public boolean saveEnabled = true;
	//backup
	public boolean backupEnabled = false;
	public int backupInterval =  60*60*6;
	public boolean backupBroadcast = true;
	public boolean backupsaveBefore = true;
		//localfs backup
		public boolean localfsbackupenabled = true;
		public List<String> lfsbackupWorldsList = null;
		public int lfsMaxNumberOfWorldsBackups = 15;
		public boolean lfsbackuppluginsfolder = false;
		public int lfsMaxNumberOfPluginsBackups = 15;
		public List<String> lfsextfolders;
		public List<String> lfsbackupexcludefolders;
		public boolean lfsbackuptoextfolders = false;
		public boolean lfsdonotbackuptointfld = true;
		public boolean lfsbackupzip = false;
		//ftp backup
		public String ftphostname = "127.0.0.1";
		public int ftpport = 21;
		public String ftpusername = "user";
		public String ftppassworld = "password";
		public String ftppath = "/asw/";
		public boolean ftpbackupenabled = false;
		public List<String> ftpbackupWorlds = null;
		public boolean ftpbackuppluginsfolder = false;
		public List<String> ftpbackupexcludefolders;
		public boolean ftpbackupzip = false;
	//purge
	public int purgeInterval = 60*60*24;
	public long purgeAwayTime = 60*60*24*30;
	public boolean purgeEnabled = false;
	public boolean purgeBroadcast = true;
	public boolean wg = true;
	public boolean wgregenrg = true;
	public boolean wgnoregenoverlap = true;
	public boolean lwc = true;
	public boolean lwcdelprotectedblocks = false;
	public boolean mvinv = true;
	public boolean pm = true;
	public boolean pmregen = true;
	public boolean dat = true;
	//lang
	public boolean switchtolangfile = false;
	public String langfilesuffix = "ru";
	//crashrestart
	public boolean crashrestartenabled = false;
	public String crashrestartscriptpath="start.sh";
	public boolean crstop = false;
	public long crtimeout = 60;
	//autorestart
	public boolean autorestart = false;
	public boolean autorestartBroadcast = true;
	public String autorestartscriptpath = "start.sh";
	public List<String> autorestarttime = new ArrayList<String>();
	public boolean autorestartcountdown = true;
	public int autorestartseconds = 20;
	public boolean astop = false;
	//consolecmmand
	public boolean cctimeenabled = false;
	public List<String> cctimetimes = new ArrayList<String>();
	public HashMap<String, ArrayList<String>> cctimescommands = new HashMap<String, ArrayList<String>>();
	public boolean ccintervalenabled = false;
	public int ccintervalinterval = 600;
	public List<String> ccintervalcommands = new ArrayList<String>();
	//worldregen
	public boolean worldregensavewg = true;
	public boolean worldregensavefactions = false;
	


	
	//config load/save functions
	public void load() {
		
		config = YamlConfiguration.loadConfiguration(new File("plugins/AutoSaveWorld/config.yml"));
		
		// Variables
		varDebug = config.getBoolean("var.debug", varDebug);
		
		//save variables
		saveEnabled = config.getBoolean("save.enabled",saveEnabled);
		saveBroadcast = config.getBoolean("save.broadcast", saveBroadcast);
		saveInterval = config.getInt("save.interval", saveInterval);

		//backup variables
		backupEnabled = config.getBoolean("backup.enabled", backupEnabled);
		backupInterval = config.getInt("backup.interval", backupInterval);
		backupBroadcast = config.getBoolean("backup.broadcast", backupBroadcast);
		backupsaveBefore = config.getBoolean("backup.savebefore",backupsaveBefore);
			//localfs
			localfsbackupenabled = config.getBoolean("backup.localfs.enabled",localfsbackupenabled);	
			lfsMaxNumberOfWorldsBackups = config.getInt("backup.localfs.MaxNumberOfWorldsBackups", lfsMaxNumberOfWorldsBackups);
			lfsMaxNumberOfPluginsBackups = config.getInt("backup.localfs.MaxNumberOfPluginsBackups", lfsMaxNumberOfPluginsBackups);
			lfsbackuptoextfolders = config.getBoolean("backup.localfs.toextfolders", lfsbackuptoextfolders);
			lfsextfolders = config.getStringList("backup.localfs.extfolders");
			lfsdonotbackuptointfld = config.getBoolean("backup.localfs.disableintfolder", lfsdonotbackuptointfld);
			lfsbackuppluginsfolder = config.getBoolean("backup.localfs.pluginsfolder", lfsbackuppluginsfolder);
			lfsbackupexcludefolders = config.getStringList("backup.localfs.excludefolders");
			lfsbackupzip = config.getBoolean("backup.localfs.zip", lfsbackupzip);
			lfsbackupWorldsList = config.getStringList("backup.localfs.worlds");
			if (lfsbackupWorldsList.size() == 0) {
				lfsbackupWorldsList.add("*");
			}

		
		//purge variables
		purgeInterval = config.getInt("purge.interval", purgeInterval);
		purgeAwayTime = config.getLong("purge.awaytime", purgeAwayTime);
		purgeEnabled = config.getBoolean("purge.enabled", purgeEnabled);
		purgeBroadcast = config.getBoolean("purge.broadcast", purgeBroadcast);
		wg = config.getBoolean("purge.wg.enabled", wg);
		wgregenrg = config.getBoolean("purge.wg.regenpurgedregion", wgregenrg);
		wgnoregenoverlap = config.getBoolean("purge.wg.noregenoverlapregion",wgnoregenoverlap);
		lwc = config.getBoolean("purge.lwc.enabled", lwc);
		lwcdelprotectedblocks = config.getBoolean("purge.lwc.deletepurgedblocks",lwcdelprotectedblocks);
		mvinv = config.getBoolean("purge.mvinv.enabled",mvinv);
		pm = config.getBoolean("purge.pm.enabled", pm);
		pmregen = config.getBoolean("purge.pm.regenpurgedplot",pmregen);
		dat = config.getBoolean("purge.dat.enabled", dat);
		
		//crashrestart variables
		crashrestartenabled = config.getBoolean("crashrestart.enabled",crashrestartenabled);
		crashrestartscriptpath = config.getString("crashrestart.scriptpath",crashrestartscriptpath);
		crtimeout = config.getLong("crashrestart.timeout",crtimeout);
		crstop = config.getBoolean("crashrestart.juststop", crstop);
		
		//autorestart variables
		autorestart = config.getBoolean("autorestart.enabled", autorestart);
		autorestartBroadcast = config.getBoolean("autorestart.broadcast", autorestartBroadcast);
		autorestarttime = config.getStringList("autorestart.time");
		autorestartcountdown = config.getBoolean("autorestart.countdown.enabled", autorestartcountdown);
		autorestartseconds = config.getInt("autorestart.countdown.seconds",autorestartseconds);
		autorestartscriptpath = config.getString("autorestart.scriptpath",autorestartscriptpath);
		astop = config.getBoolean("autorestart.juststop", astop);
		
		//autoconsolecommand variables
		cctimeenabled = config.getBoolean("consolecommand.timemode.enabled", cctimeenabled);
		if (config.getConfigurationSection("consolecommand.timemode.times") != null)
		{
			cctimetimes = new ArrayList<String>(config.getConfigurationSection("consolecommand.timemode.times").getKeys(false));
		}
		cctimescommands.clear();
		for (String cctime : cctimetimes)
		{
			cctimescommands.put(cctime, (ArrayList<String>) config.getStringList("consolecommand.timemode.times."+cctime));
		}
		ccintervalenabled = config.getBoolean("consolecommand.intervalmode.enabled", ccintervalenabled);
		ccintervalinterval = config.getInt("consolecommand.intervalmode.interval", ccintervalinterval);
		ccintervalcommands = config.getStringList("consolecommand.intervalmode.commands");
		
		//worldregen variables
		worldregensavewg = config.getBoolean("worldregen.savewg",worldregensavewg);
		worldregensavefactions = config.getBoolean("worldregen.savefactions",worldregensavefactions);
		
		//locale variables
		switchtolangfile = config.getBoolean("locale.switchtolangfile",switchtolangfile);
		langfilesuffix = config.getString("locale.langfilesuffix",langfilesuffix);
		
		
		save();
	}

	public void save() {
		config = new YamlConfiguration();
		
				
		// Variables
		config.set("var.debug", varDebug);
		
		//save variables
		config.set("save.enabled",saveEnabled);
		config.set("save.interval", saveInterval);
		config.set("save.broadcast", saveBroadcast);

		//backup variables
		config.set("backup.enabled", backupEnabled);
		config.set("backup.interval", backupInterval);
		config.set("backup.savebefore",backupsaveBefore);
		config.set("backup.broadcast", backupBroadcast);
			//localfs
			config.set("backup.localfs.enabled",localfsbackupenabled);	
			config.set("backup.localfs.worlds", lfsbackupWorldsList);
			config.set("backup.localfs.MaxNumberOfWorldsBackups", lfsMaxNumberOfWorldsBackups);
			config.set("backup.localfs.pluginsfolder", lfsbackuppluginsfolder);
			config.set("backup.localfs.MaxNumberOfPluginsBackups", lfsMaxNumberOfPluginsBackups);
			config.set("backup.localfs.excludefolders",lfsbackupexcludefolders);
			config.set("backup.localfs.toextfolders", lfsbackuptoextfolders);
			config.set("backup.localfs.disableintfolder", lfsdonotbackuptointfld);
			config.set("backup.localfs.extfolders",lfsextfolders);
			config.set("backup.localfs.zip",lfsbackupzip);

		
		//purge variables
		config.set("purge.enabled", purgeEnabled);
		config.set("purge.interval", purgeInterval);
		config.set("purge.awaytime", purgeAwayTime);
		config.set("purge.broadcast",purgeBroadcast);
		config.set("purge.wg.enabled", wg);
		config.set("purge.wg.regenpurgedregion", wgregenrg);
		config.set("purge.wg.noregenoverlapregion",wgnoregenoverlap);
		config.set("purge.lwc.enabled", lwc);
		config.set("purge.mvinv.enabled",mvinv);
		config.set("purge.pm.enabled", pm);
		config.set("purge.pm.regenpurgedplot",pmregen);
		config.set("purge.lwc.deletepurgedblocks", lwcdelprotectedblocks);
		config.set("purge.dat.enabled", dat);
		
		//crashrestart variables
		config.set("crashrestart.enabled",crashrestartenabled);
		config.set("crashrestart.scriptpath",crashrestartscriptpath);
		config.set("crashrestart.timeout",crtimeout);
		config.set("crashrestart.juststop", crstop);
		
		//autorestart variables
		config.set("autorestart.enabled", autorestart);
		config.set("autorestart.broadcast", autorestartBroadcast);
		config.set("autorestart.time",autorestarttime);
		config.set("autorestart.countdown.enabled", autorestartcountdown);
		config.set("autorestart.countdown.seconds",autorestartseconds);
		config.set("autorestart.scriptpath",autorestartscriptpath);
		config.set("autorestart.juststop", astop);
		
		
		//autoconsolecommand variables
		config.set("consolecommand.timemode.enabled", cctimeenabled);
		if (cctimescommands.isEmpty())
		{
			config.createSection("consolecommand.timemode.times");
		}
		for (String cctime : cctimescommands.keySet())
		{
			config.set("consolecommand.timemode.times."+cctime, cctimescommands.get(cctime));
		}
		config.set("consolecommand.intervalmode.enabled", ccintervalenabled);
		config.set("consolecommand.intervalmode.interval", ccintervalinterval);
		config.set("consolecommand.intervalmode.commands", ccintervalcommands);
		
		//worldregen variables
		config.set("worldregen.savewg",worldregensavewg);
		config.set("worldregen.savefactions",worldregensavefactions);
		
		//locale variables
		config.set("locale.switchtolangfile",switchtolangfile);
		config.set("locale.langfilesuffix",langfilesuffix);
		
		
		try {
			config.save(new File("plugins/AutoSaveWorld/config.yml"));
		} catch (IOException ex) {}
		
	}
	
}