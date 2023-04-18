require wpebackend-fdo.inc

DEFAULT_PRERENCE = "-1"
PV = "1.0.0~git"

# This version of WPEBackend-fdo is not selected by default on this layer,
# as the released versions is preferred.
# To select it, add on your local.conf conf file the line below:
#
# PREFERRED_VERSION_wpebackend-fdo = "1.0.0~git%"

SRCREV = "${AUTOREV}"

#Below CAF project is mirror from "github.com/Igalia/WPEBackend-fdo.git"
SRC_URI = "${CLO_LE_GIT}/WPEBackend-fdo.git;protocol=https;branch=caf_migration/igalia/master"
S = "${WORKDIR}/git"

DEPENDS += " libwpe"
