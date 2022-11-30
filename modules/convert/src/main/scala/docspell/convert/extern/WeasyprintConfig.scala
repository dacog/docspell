/*
 * Copyright 2020 Eike K. & Contributors
 *
 * SPDX-License-Identifier: AGPL-3.0-or-later
 */

package docspell.convert.extern

import fs2.io.file.Path

import docspell.common.SystemCommand

case class WeasyprintConfig(command: SystemCommand.Config, workingDir: Path)
