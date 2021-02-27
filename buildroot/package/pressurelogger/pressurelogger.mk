################################################################################
#
# pressurelogger
#
################################################################################

PRESSURELOGGER_SITE = ${HOME}/pressure_logger/host
PRESSURELOGGER_SITE_METHOD = local

define PRESSURELOGGER_INSTALL_TARGET_CMDS
	$(INSTALL) -D -m 0755 $(@D)/PressureLogger $(TARGET_DIR)/usr/bin/PressureLogger
endef

$(eval $(cmake-package))
