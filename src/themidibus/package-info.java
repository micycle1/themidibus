/**
 * Copyright (c) 2009 Severin Smith
 *
 * This file is part of a library called The MidiBus (themidibus) - http://www.smallbutdigital.com/themidibus.php.
 *
 * The MidiBus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The MidiBus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the MidiBus. If not, see <http://www.gnu.org/licenses/>.
*/

/**
 * The MidiBus provides a simple way to access and interact with installed MIDI
 * system resources, although it's especially designed to be used with
 * <a target="_blank" href="http://www.processing.org">Processing</a>, it could
 * easily be adapted for use in any java program.
 * <p>
 * <b style="color:red;">IMPORTANT</b>: Mac users may want to install
 * <a href="http://www.humatic.de/htools/mmj.htm">mmj, <i>a Mac OS X universal
 * binary java MIDI subsystem</i></a> - or an equivalent third party MIDI
 * subsystem - because the apple implementation is lacking support for a number
 * of advanced MIDI features. Mmj is recommended because it works, it's free and
 * it's almost open source (CC licence). Please check README.md for more
 * information. If you do use MMJ you will want to set
 * {@link themidibus.MidiBus#sendTimestamps(boolean sendTimestamps)} to false,
 * otherwise messages won't be sent.
 * <p>
 * Keeping with the spirit of Processing's easy to use sketching/prototyping
 * style, the MidiBus offers a clean and simple way to get at MIDI ressources.
 * Getting the basic functionality of the MidiBus up and running in a sketch is
 * a matter of only a few line. The {@link themidibus.MidiBus} class provides
 * everything needed send and receive MIDI inside a sketch. To jump right into
 * the Midibus, either refer to the paragraph titled "Typical Implementation,
 * Simple" in the description for the {@link themidibus.MidiBus} class, or check
 * out the code examples distributed with this library.
 * <hr>
 * <p>
 * It is important to understand that the MidiBus offers little functionality
 * that isn't available from Java's native <a target="_blank" href=
 * "http://java.sun.com/j2se/1.5.0/docs/api/javax/sound/midi/package-summary.html">javax.sound.midi</a>
 * package. Anyone interested in working with MIDI in Java should take the time
 * to read the documentation for the <a target="_blank" href=
 * "http://java.sun.com/j2se/1.5.0/docs/api/javax/sound/midi/package-summary.html">javax.sound.midi</a>.
 * It offers a more full featured and flexible alternative to this package,
 * although it does do so at the cost of added complexity. In addition, it may
 * be worthwhile to skim
 * <a href="http://java.sun.com/docs/books/tutorial/sound/index.html">the
 * "official" Java Tutorial</a> for the javax.sound.* packages.
 * <hr>
 * <h2>Related Documentation</h2>
 * <ul>
 * <li><a href="http://www.smallbutdigital.com/themidibus.php">The MidiBus
 * website: examples, updates, documentation, etc</a></li>
 * <li><a href=
 * "http://java.sun.com/j2se/1.5.0/docs/api/javax/sound/midi/package-summary.html">javax.sound.midi
 * Package</a></li>
 * <li><a href="http://java.sun.com/docs/books/tutorial/sound/index.html">Java
 * Sound Tutorials</a></li>
 * <li><a href="http://www.srm.com/qtma/davidsmidispec.html">MIDI Specification
 * Reference</a></li>
 * <li><a href="http://www.indiana.edu/~emusic/cntrlnumb.html">Standard
 * Controller Numbers</a></li>
 * </ul>
 *
 * @version 008
 * @author Severin Smith
 */

package themidibus;
