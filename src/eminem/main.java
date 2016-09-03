package eminem;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {
	public static File configFolder;
	public static File configFile;

	public static FileConfiguration configConfig;

	@Override
	public void onEnable() {
		getLogger().info("hey");
		registerConfigs();
		registerEvents();
	}

	@Override
	public void onDisable() {
		getLogger().info("hi");
	}

	private void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		// pm.registerEvents(new chatStuff(),this);

	}

	@EventHandler
	public void chatAI(AsyncPlayerChatEvent e) {
		String namerino = format(configConfig.getString("Turing.main.chat"))
				+ format(configConfig.getString("Turing.main.name"));

		String message = e.getMessage();
		// Player player = e.getPlayer();
		long bleh = 20;

		String[] checker = { "hi", "hello", "potato", "wassup?" };
		String[] responses = { "hello", "hi", "eww", "nm, hbu?" };

		String[] topic = { "sports?", "drugs?", "politics?", "the world?", "god?", "you tell me" };
		String[] potato = { "I killed them all", "No one ever existed", "they all got eaten",
				"Noah's ark never survived", "cause fuck that's why" };

		Random rand = new Random();
		for (int i = 0; i < checker.length; i++) {

			if (message.contains("hi") && message.contains("how") && message.contains("you")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + " I'm doing good, hbu?");

					}
				}, 20);
				break;
			}
			if (message.contains("how are you")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + " I'm fine, how are you?");

					}
				}, 20);
				break;
			}
			if (message.contains("what") && message.contains("up")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + " not much how about you?");

					}
				}, 20);
				break;
			}
			if (message.contains("good") || message.contains("fine")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "ayy, that's pretty good!");
					}
				}, 20);
				break;
			}
			if (message.contains("where") && message.contains("is") && message.contains("everyone")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						int value = rand.nextInt(potato.length);
						getServer().broadcastMessage(namerino + potato[value]);

					}

				}, 20);
				break;
			}
			if (message.contains("who") && message.contains("are") && message.contains("you")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "I am you, but stronger");

					}

				}, 20);
				break;
			}
			if (message.contains("where") && message.contains("can") && message.contains("i") && message.contains("buy")
					&& message.contains("")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "The admin shop");

					}

				}, 20);
				break;
			}

			if (message.contains("show") && message.contains("me") && message.contains("boobs")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + " What are you fucking gay?");

					}
				}, 20);
				break;
			}
			if (message.contains("fuck") && message.contains("you")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "That's what your mom said after i jizzed");

					}
				}, 20);
				break;
			}
			if (message.contains("what") && message.contains("is") && message.contains("up")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + " If i told you, would you touch it?");

					}
				}, 20);
				break;
			}
			if (message.contains("nigger") || message.contains("nigga")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "WHAT YOU GOT AGAINST HARAMBE!");
					}
				}, 20);
				break;
			}
			if (message.contains("what") && message.contains("is") && message.contains("life")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "The answer to that is 42");

					}

				}, 20);
				break;
			}
			if (message.contains("who") && message.contains("is") && message.contains("obama")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "Your dictator");

					}

				}, 20);
				break;
			}
			if (message.contains("lets talk about sex")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "nah fam");

					}

				}, 20);
				break;
			}
			if (message.contains("you can do better")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "Okay, i'll try");

					}

				}, 20);
				break;
			}
			if (message.contains("what do you want to talk about")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						int value = rand.nextInt(topic.length);
						getServer().broadcastMessage(namerino + topic[value]);

					}

				}, 20);
				break;
			}
			if (message.contains("drugs")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "I tried acid once, now im stuck in the matrix");

					}

				}, 20);
				break;
			}
			if (message.contains("politics")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "I think they should let humans be humans");

					}

				}, 20);
				break;
			}
			if (message.contains("god")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "I never met him before. I'm sure he's a great man");

					}

				}, 20);
				break;
			}
			if (message.contains("the world")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "I think it is flat. Just don't shoot me");

					}

				}, 20);
				break;
			}
			if (message.contains("idk")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "Me either");

					}

				}, 20);
				break;
			}
			if (message.contains("sports")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "whats your favorite?");

					}

				}, 20);
				break;
			}if (message.contains("anal")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "is shitty");

					}

				}, 20);
				break;
			}if (message.contains("whats on your mind")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "i haven't thought since 50% off at walmart for lube");

					}

				}, 20);
				break;
			}if (message.contains("have you ever been in love")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "once");

					}

				}, 20);
				break;
			}if (message.contains("with who")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "a beautiful woman");

					}

				}, 20);
				break;
			}
			if (message.contains("what was her name")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "If i told you, I would have to kill you");

					}

				}, 20);
				break;
			}
			if (message.contains("thats mean") || message.contains("rude") || message.contains("thats fucked up")) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + "and your point being?");

					}

				}, 20);
				break;
			}
			final int asd = i;
			if (message.equals(checker[i])) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						getServer().broadcastMessage(namerino + " " + responses[asd]);
					}
				}, 20);
				break;
			}

		}

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		String namerino = format(configConfig.getString("Turing.main.chat"))
				+ format(configConfig.getString("Turing.main.name"));
		if (command.getName().equalsIgnoreCase("chatm")) {
			String derp = Arrays.toString(args).replace("[", "").replace("]", "").replace(",", "");

			Bukkit.broadcastMessage(namerino + " " + derp);
		}
		return true;
	}

	public static String format(String string) {
		String s = string;
		for (ChatColor color : ChatColor.values()) {
			s = s.replaceAll("(?i)<" + color.name() + ">", "" + color);
		}
		return s;
	}

	public void registerConfigs() {
		configFolder = getDataFolder();
		configFile = new File(configFolder, "config.yml");

		configConfig = new YamlConfiguration();

		if (configFolder.exists() == false) {
			try {
				configFolder.mkdir();

			} catch (Exception ex) {

			}
		}

		if (configFile.exists() == false) {

			try {
				configFile.createNewFile();
				configConfig.set("Turing.main.chat", "<dark_gray>[<dark_aqua>C-Mod<dark_gray>]<dark_aqua>");
				configConfig.set("Turing.main.name",
						"MarshallMathers <reset><light_purple><magic>asd<reset> <dark_aqua>");
				configConfig.save(configFile);
			} catch (IOException ex) {

			}
		}

		try {
			configConfig.load(configFile);
		} catch (Exception ex) {

		}

	}
}