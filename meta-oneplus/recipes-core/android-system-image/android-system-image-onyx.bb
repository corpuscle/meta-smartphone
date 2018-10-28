require recipes-core/android-system-image/android-system-image.inc

COMPATIBLE_MACHINE = "onyx"

PV = "20181018-99"

SRC_URI = "file:///home/itm/resultsonyx/halium-luneos-7.1-${PV}-${MACHINE}.tar.bz2"
SRC_URI[md5sum] = "ace597c83a63398664d2e7fd9a949922"
SRC_URI[sha256sum] = "75d2563af402b2456ceb014a8ffba5507d6353d82837a2b5c1d91473d0a471aa"
