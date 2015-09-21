package erickpires.com.podcenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by erick on 21/09/15.
 */
public class PodcastListAdapter extends BaseAdapter {
	Context context;

	public PodcastListAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		return 1000;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {
			LayoutInflater layoutInflater = LayoutInflater.from(context);
			convertView = layoutInflater.inflate(R.layout.podcast_list_item, null);
		}


		TextView contentTextView = (TextView) convertView.findViewById(R.id.content);
		contentTextView.setText("Erick e Bia " + position);


		if(position % 2 == 0) {
			contentTextView.setTextColor(0xFFDDDDDD);
		}
		else {
			contentTextView.setTextColor(0xFF333333);
		}

		return convertView;
	}
}
