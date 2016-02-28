package l.j.ltetris.view;

import l.j.ltetris.bean.Bean;
import l.j.ltetris.option.WindowOption;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 主窗口
 * @author 建
 *	
 */
public class WindowView extends View {
	/**
	 * 参数数据源
	 */
	private WindowOption option;
	/**
	 * 画笔
	 */
	private Paint paint;
	/**
	 * 当前方块
	 */
	private Bean thisTetris;
	/**
	 * 下一个方块
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
