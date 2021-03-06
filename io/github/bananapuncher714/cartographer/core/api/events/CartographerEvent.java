package io.github.bananapuncher714.cartographer.core.api.events;

import org.bukkit.event.Event;

import io.github.bananapuncher714.cartographer.core.util.BukkitUtil;

/**
 * Parent event for all Cartographer events
 * 
 * @author BananaPuncher714
 */
public abstract class CartographerEvent extends Event {
	public void callEvent() {
		BukkitUtil.callEventSync( this );
	}
}
