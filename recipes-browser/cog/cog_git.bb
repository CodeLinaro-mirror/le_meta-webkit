require cog.inc

PV = "git${AUTOREV}"
SRCREV = "${AUTOREV}"
SRC_URI = "${CLO_LE_GIT}/Igalia/cog.git;protocol=https;branch=caf_migration/Igaliacog/master"
S = "${WORKDIR}/git"
