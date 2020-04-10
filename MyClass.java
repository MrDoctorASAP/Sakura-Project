/**
 *    パスワードを入力するためのテストダイアログ。 
 *    これを呼び出して、ユーザーにパスワードを要求できます。
 *    パスワードがフィールドの外に出
 *    る可能性があるため
 *    、パスワードの長さを制御することはできません。
 *    それをやり直します。
 * */
public class MyClass {
	/**
	 * TODO
	 *     パスワードがフィールドの外に出る可能性があるため、
	 *     パスワードの長さを制御することはできません。
	 *     それをやり直します。
	 * */
	static int アプリケーションテーマ = 1; // 可能な値 - 0 1 
	static String f = "";
	static String p = "";
	/**
	 *  プログラムの主な唯一の方法である私自身
	 *  、プログラム全体を1つの方法で作成でき
	 *  ることに驚きました。それは私に多くの
	 *  費用がかかりました。
	 * */
	public static void main(String[] 引数) {
		javax.swing.JDialog a = new javax.swing.JDialog();
		a.setTitle("パスワードを入力してください");
		a.setBounds(100, 100, 400, 300);
		a.setResizable(false);
		java.awt.Color b = java.awt.Color.BLACK, c = java.awt.Color.WHITE;
		java.awt.Font e = new java.awt.Font("Courer new", 1, 25);
		java.awt.Font v = new java.awt.Font("Courer new", 0, 35);
		javax.swing.JPanel d = new javax.swing.JPanel() {
			/**
			 *2つのテーマを同時にサポー
			 * トするプログラムの新
			 * しいデザイン
			 */
			private static final long serialVersionUID = -8817933832120096153L;
			@Override
			public void paintComponent(java.awt.Graphics g) {
				if(アプリケーションテーマ == 0) g.setColor(b);
				if(アプリケーションテーマ == 1) g.setColor(c);
				g.fillRect(0, 0, 400, 300);
				if(アプリケーションテーマ == 1) g.setColor(b);
				if(アプリケーションテーマ == 0) g.setColor(c);
				g.setFont(e);
				g.drawString("パスワード", 125, 75);
				g.fillRect(50, 100, 300, 50);
				if(アプリケーションテーマ == 0) g.setColor(b);
				if(アプリケーションテーマ == 1) g.setColor(c);
				g.fillRect(52, 102, 296, 46);
				if(アプリケーションテーマ == 1) g.setColor(b);
				if(アプリケーションテーマ == 0) g.setColor(c);
				g.setFont(v);
				g.drawString(f, 57, 137);
			}
		};
		a.getContentPane().add(d);
		a.addKeyListener(new java.awt.event.KeyListener() {
			public void keyTyped(java.awt.event.KeyEvent e) {}
			public void keyReleased(java.awt.event.KeyEvent e) {}
			public void keyPressed(java.awt.event.KeyEvent e) {
				if(e.getKeyCode() == 8) {
					if(f.length() > 0 ) f = f.substring(1);
					p = p.substring(0, p.length() - 1);
				} else if(e.getKeyCode() == 10) {
					a.setVisible(false);
					javax.swing.JOptionPane.showMessageDialog(null, "パスワード  :   " + p);
					javax.swing.JOptionPane.showMessageDialog(null, "パスワード  :   " + p,  
							"入力されたパスワード", javax.swing.JOptionPane.INFORMATION_MESSAGE);;
					System.exit(0);
				} else {
					p += e.getKeyChar();
					f+="*";
				}
				d.repaint();
			}
		});
		a.setVisible(true);	
	}
}
