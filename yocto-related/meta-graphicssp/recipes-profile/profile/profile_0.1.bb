SUMMARY = "Profile file in yocto OS"
DESCRIPTION = "Profile file in yocto OS"
HOMEPAGE = ""
LICENSE = "CLOSED"
MY_FILES = "/home/saumo/Desktop/final_try/yocto/poky/meta-graphicssp/recipes-profile/profile/profile-0.1/.profile"

do_install() {
	install -m 0644 ${MY_FILES} ${D}${base_prefix}
}

FILES_${PN} += "${base_prefix}"
ALLOW_EMPTY_${PN} = "1"
