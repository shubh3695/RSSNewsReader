package com.td.rssreader.parser;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;
/*Created by Shubham Saxena
* Date: 27/03/2015*/
public class RSSFeed implements Serializable {

	private static final long serialVersionUID = 1L;
	private int _itemcount = 0;
	private List<RSSItem> _itemlist;

	RSSFeed() {
		_itemlist = new Vector<RSSItem>(0);
	}

	void addItem(RSSItem item) {
		_itemlist.add(item);
		_itemcount++;
	}

	public RSSItem getItem(int location) {
		return _itemlist.get(location);
	}

	public int getItemCount() {
		return _itemcount;
	}

}
