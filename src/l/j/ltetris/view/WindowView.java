package l.j.ltetris.view;

import l.j.ltetris.bean.Bean;
import l.j.ltetris.option.WindowOption;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * ������
 * @author ��
 *	
 */
public class WindowView extends View {
	/**
	 * ��������Դ
	 */
	private WindowOption option;
	/**
	 * ����
	 */
	private Paint paint;
	/**
	 * ��ǰ����
	 */
	private Bean thisTetris;
	/**
	 * ��һ������
	 */
	private Bean nextTetris;
	
	private void init(){
		paint = new Paint();
		paint.setAntiAlias(true);
	}
	
	public WindowView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}
	public WindowView(Context context, AttributeSet attrs) {
		this(context, attrs,0);
	}
	public WindowView(Context context) {
		this(context,null);
	}
}
