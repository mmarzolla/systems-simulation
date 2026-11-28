# JAVASIMULATION

This is a modified version the JAVASIMULATION package originally
developed by Keld Helsgaun, Roskilde University. The original Web page
of the package is no longer available, but an archived copy is here
<https://web.archive.org/web/20261004162416/http://webhotel4.ruc.dk/~keld/>.

JAVASIMULATION is a discrete-event simulation package written in Java.
It supports the process-oriented paradigm like that provided by the
[SIMULA programming language](https://en.wikipedia.org/wiki/Simula);
users familiar with SIMULA will find the exact same primitives.

This is **not** the original JAVASIMULATION code; I have stripped
pre-compiled `.class` files that had no source available, removed a
few example programs that depended on packages not available in this
archive, and moved/renamed a few programs to make compilation easier.

To compile all examples, run the following Unix shell command:

    javac -d build/ -sourcepath packages/ examples/*/*.java

To run an example, say `QueueingSimulationv1`:

    java -cp build/ QueueingSimulationv1

Refer to the original documentation in the `docs/` directory for
additional information.

## Original README file

The software is available in two formats:

    JAVASIMULATION-1.1.tgz	(gzipped tar file, app. 640 KB)
	JAVASIMULATION-1.0.sitx	(Stuffit archive,  app. 700 KB)

If a UNIX machine is used, download the software in the first format.
Next execute the following UNIX commands:

    gzip -d JAVASIMULATION-1.1.tgz
    tar xvf JAVASIMULATION-1.1.tar

If a MacOS or a Windows machine is used, download the software in the second format. Next unstuff it with StuffIt Expander (freeware available at <http://www.aladdinsys.com>).

For further instructions, see the guides in the directory docs.

The docs folder contains the following documentation:

(1) javaSimulation_INSTALL.pdf, this installation guide

(2) javaSimulation_GUIDE.pdf, a user guide to the javaSimulation package

(3) javaCoroutine_GUIDE.pdf, a user guide to the javaCoroutine package

(4) Report.pdf, a report that describes the implementation of the software.

The code is distributed for research use. The author reserves all rights to the code.
