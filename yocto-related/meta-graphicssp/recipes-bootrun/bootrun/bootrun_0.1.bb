SUMMARY = "Run new screen session on bootup"
DESCRIPTION = "Boot up screen run"
HOMEPAGE = ""
LICENSE = "CLOSED"
MY_FILES = "/home/saumo/Desktop/final_try/yocto/poky/meta-graphicssp/recipes-bootrun/bootrun/bootrun-0.1/bootrun.sh"

do_install() {
	install -d ${D}${sysconfdir}/bootscript
	install -m 0644 ${MY_FILES} ${D}${sysconfdir}/bootscript
	chmod a+x ${D}${sysconfdir}/bootscript/bootrun.sh
	chmod 777 ${D}${sysconfdir}/bootscript/bootrun.sh
}

FILES_${PN} += "${sysconfdir}/bootscript"
