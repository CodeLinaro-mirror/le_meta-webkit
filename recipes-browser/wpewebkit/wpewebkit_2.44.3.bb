require wpewebkit.inc
require conf/include/devupstream.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "https://wpewebkit.org/releases/${BPN}-${PV}.tar.xz;name=tarball \
           file://0002-Activate-HAVE_MISSING_STD_FILESYSTEM_PATH_CONSTRUCTO.patch \
           file://0004-Revert-Cherry-pick-272448.770-safari-7618-branch-6d3.patch \
           file://0005-Cherry-pick-282306-main-96fb0b0c6c46-.-https-bugs.we.patch \
          "

SRC_URI[tarball.sha256sum] = "55c639879eaa5f070fb1c11fccb968cd85ca21680cc8cd0cd638135ca24433bb"

SRC_URI:class-devupstream = "git://github.com/WebKit/WebKit.git;protocol=https;branch=main"

# Since 2.44+. The ENABLE_ACCESSIBILITY build option has been removed.
# A new USE_ATK option may be used to disable accessibility.
PACKAGECONFIG[accessibility] = "-DUSE_ATK=ON,-DUSE_ATK=OFF,atk at-spi2-atk"

# libbacktrace. Since 2.44+
PACKAGECONFIG[libbacktrace] = "-DUSE_LIBBACKTRACE=ON,-DUSE_LIBBACKTRACE=OFF,libbacktrace"

# The WPE 2.44.X branch was forked from the main branch in this commit
SRCREV:class-devupstream = "aee89255166e206da133e61fd57f4a158b6fdc80"

PACKAGECONFIG:append = " libbacktrace"

DEPENDS += " libinput libtasn1"
